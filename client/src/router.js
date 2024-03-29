import Vue from 'vue';
import Router from 'vue-router';

Vue.use(Router);

// ===================== Pages Components ======================
import Hello from './components/Hello';
import MainPanel from './components/MainPanel';
import Signup from './components/Signup';
import Welcome from './components/Welcome';

// ==================== Router registration ====================
export default new Router({
  mode: 'hash',
  routes: [
    { path: '/', component: MainPanel },
    { path: '/signup', component: Welcome },
  ],
});
