import {Card, CardContent, Typography} from "@mui/material";
import React from "react";

function Reservation(props) {
    return (
        <Card key={props.reservation.id}>
            <CardContent >
                <Typography variant="h5" component="h2">
                    {'Resevation ' + props.reservation.id}
                </Typography>
                <Typography color="textSecondary">
                    {props.reservation.showtime.cinema.name}
                </Typography>
                <Typography color="textSecondary">
                    {props.reservation.showtime.movie.title}
                </Typography>
            </CardContent>
        </Card>);
}

export default Reservation;