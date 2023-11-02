import MainLayout from 'Frontend/src/views/MainLayout.js';
import { lazy } from 'react';
import { createBrowserRouter, RouteObject } from 'react-router-dom';
import LoginPage from './src/views/pages/login/LoginPage';
import { HomePage } from './src/views/pages/home/HomePage';
import NotFoundPage from './src/views/pages/NotFound/NotFoundPage';
import AboutPage from 'Frontend/src/views/pages/about/AboutPage.js';

const AboutView = lazy(async () => import('Frontend/src/views/pages/about/AboutPage.js'));

export const routes: RouteObject[] = [
  {
    // element: <MainLayout />,
    handle: { title: 'Main' },
    children: [
      { path: '/login', element: <LoginPage />, handle: { title: 'Login' } },
      { path: '/', element: <HomePage />, handle: { title: 'Home' } },
      { path: '/about', element: <AboutPage />, handle: { title: 'About' } },
      { path: '/*', element: <NotFoundPage />, handle: { title: 'Not Found' } },

    ],
  },
];

export default createBrowserRouter(routes);
