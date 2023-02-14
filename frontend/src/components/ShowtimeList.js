import React, {useEffect, useState} from 'react';
import {getAllShowtimes} from "../api/showtimes";
import Showtime from "./Showtime";
import {Alert, AlertTitle} from "@mui/material";
import Reservation from "./Reservation";

function ShowtimeList() {
    const [showtimes, setShowtimes] = useState([]);
    const [reservation, setReservation] = useState();

    const handleClick = (showtime) => {
        setReservation({
            id: "XXX",
            showtime: showtime
        });
    }

    useEffect(() => {
        const fetchShowtimes = async () => {
            const data = await getAllShowtimes();
            setShowtimes(data);
        };
        fetchShowtimes();
    }, []);

    return (
        <div>
            {reservation && <Alert severity="success" onClose={() => setReservation(undefined)}>
                <AlertTitle>Bravo ! Vous avez réservé !</AlertTitle>
                <Reservation reservation={reservation}></Reservation>
            </Alert>}
            {showtimes.map((showtime) => (<Showtime showtime={showtime} onClick={handleClick}/>))}
        </div>
    );
}

export default ShowtimeList;
