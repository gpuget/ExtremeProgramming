import axios from "axios";

export const getAllShowtimes = () => {
    return axios.get(process.env.REACT_APP_BACK_URL + "/showtimes")
        .then(res => res.data);
}