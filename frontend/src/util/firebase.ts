import { Alert } from '@mui/material';
import { initializeApp } from 'firebase/app';
import { connectAuthEmulator, getAuth, signInWithEmailAndPassword, signOut } from 'firebase/auth';
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
const firebaseConfig = {
  apiKey: "AIzaSyCFBahN6wN7_5nd42Na0heY89u-VbItE0k",
  authDomain: "trabalho-poo-be8fb.firebaseapp.com",
  databaseURL: "https://trabalho-poo-be8fb-default-rtdb.firebaseio.com",
  projectId: "trabalho-poo-be8fb",
  storageBucket: "trabalho-poo-be8fb.appspot.com",
  messagingSenderId: "663819420885",
  appId: "1:663819420885:web:d86eb87bde7f4500cc4e5c"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);


// Initialize Firebase Authentication and get a reference to the service
export const auth = getAuth(app);

connectAuthEmulator(auth, 'http://localhost:8080/');

export const handleSubmit = async (event: any) => {
  event.preventDefault();
  const data = new FormData(event.currentTarget);
  const email = data.get('email') as string;
  const password = data.get('password') as string;
  try {
    await signInWithEmailAndPassword(auth, email, password);
  } catch (err) {
    if(err === 'auth/wrong-password'){
      console.log('Please check the Password');
    }
    if(err === 'auth/user-not-found'){
      console.log('Please check the Email');
    }
  }
};

export const logout = () => {
  signOut(auth);
};