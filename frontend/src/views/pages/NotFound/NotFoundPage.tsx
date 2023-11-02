import { Box, Button, Typography } from '@mui/material';
import { purple } from '@mui/material/colors';
import image404 from "../../images/dog-ate-this-page.png";


const NotFoundPage: React.FC = () => {
  return (
    <div id="wrapper">
        <img src={image404} alt='dog ate this page'/>
        
    </div >
 ); 
}

export default NotFoundPage;