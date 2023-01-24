import axios from "axios";

export const getReservations = () => {
    return axios.get(`${process.env.REACT_APP_BACK_URL || ""}/reservations`)
        .then(res => res.data);
}
