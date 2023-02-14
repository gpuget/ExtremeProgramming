import axios from "axios";
import mockData from '../data.json'

export const getAllShowtimes = () => {
    return axios.get(process.env.REACT_APP_BACK_URL + "/showtimes")
        .then(res => res.data);
}

export const mockAllShowtimes = () => {
    return Promise.resolve(mockData.flatMap(data => data.cinema.showtimes));
}