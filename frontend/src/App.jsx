import './App.css';
import {useEffect, useState} from "react";
import {getReservations} from "./api/reservations";

function App() {

    const [reservations, setReservations] = useState();
    const [tab,  setTab] = useState(false);

    useEffect(() => {
        const fetchData = async () => {
            const response = await getReservations();
            setReservations(response);
        }

        fetchData();
    }, []);

    const toggle = () => {
        setTab(tab => !tab);
    };

    return (
        <div className="App">
            <button onClick={toggle}>Change me</button>
            { tab
                ? (<div>
                    {reservations && reservations
                    .map(reservation => reservation.username)
                    .map(username => (<p key={username}>{username}</p>))}
                    </div>)
                : (<div>
                    {reservations && reservations
                        .map(reservation => reservation.cinema)
                        .map(cinema => (<p key={cinema}>{cinema}</p>))}
                    </div>)}
        </div>
    );
}

export default App;
