import axios from "axios";

export const reserve = (showtime) => {
    return axios.post(process.env.REACT_APP_BACK_URL + "/reservations", showtime)
        .then(res => res.data);
}