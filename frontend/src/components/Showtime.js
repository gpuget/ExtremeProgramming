import {Button, Card, CardActions, CardContent, Typography} from "@mui/material";
import React from "react";

function Showtime(props) {
    return (
        <Card key={props.showtime.id}>
            <CardContent>
                <Typography variant="h5" component="h2">
                    {props.showtime.movie.title}
                </Typography>
                <Typography color="textSecondary">
                    {props.showtime.cinema.name}
                </Typography>
                <Typography variant="body2" component="p">
                    Start time: {props.showtime.start_time}
                    <br/>
                    End time: {props.showtime.end_time}
                </Typography>
                <CardActions>
                    <Button variant="contained" color="primary" onClick={() => props.onClick(props.showtime)}>Réserver</Button>
                </CardActions>
            </CardContent>
        </Card>);
}

export default Showtime;