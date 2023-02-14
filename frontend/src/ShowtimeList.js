import React, {useEffect, useState} from 'react';
import {Card, CardContent, Typography} from "@mui/material";

import cinemaData from "./data.json"

function ShowtimeList() {
    const [showtimes, setShowtimes] = useState([]);

    useEffect(() => {
        // Récupérer les séances depuis votre API ici
        const fetchShowtimes = async () => {
            const data = cinemaData.flatMap(data => data.cinema.showtimes);
            setShowtimes(data);
        };
        fetchShowtimes();
    }, []);

    return (
        <div>
            {showtimes.map((showtime) => (
                <Card key={showtime.id}>
                    <CardContent>
                        <Typography variant="h5" component="h2">
                            {showtime.movie.title}
                        </Typography>
                        <Typography color="textSecondary">
                            {showtime.cinema.name}
                        </Typography>
                        <Typography variant="body2" component="p">
                            Start time: {showtime.start_time}
                            <br/>
                            End time: {showtime.end_time}
                        </Typography>
                    </CardContent>
                </Card>
            ))}
        </div>
    );
}

export default ShowtimeList;
