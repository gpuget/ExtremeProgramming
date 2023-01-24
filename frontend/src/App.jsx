import logo from './logo.svg';
import './App.css';
import {useEffect, useState} from "react";
import {getReservations} from "./api/reservations";

function App() {

    const [title, setTitle] = useState();

    useEffect(() => {
        const fetchData = async () => {
            const response = await getReservations();
            setTitle(response);
        }

        fetchData();
    }, []);

    console.log("App :: ", title);

    return (
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo"/>
                <p>
                    Edit <code>src/App.js</code> and save to reload.
                </p>
                <p>
                    {title}
                </p>
                <a
                    className="App-link"
                    href="https://reactjs.org"
                    target="_blank"
                    rel="noopener noreferrer"
                >
                    Learn React
                </a>
            </header>
        </div>
    );
}

export default App;
