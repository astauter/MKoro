
// =============== Base libraries integration ==================
import Vue from 'vue';
import VueResource from 'vue-resource';
import VueTranslate from 'vue-translate-plugin';
import dt from 'datatables.net';
import 'datatables.net-dt/css/jquery.datatables.css';

Vue.use(VueResource);
Vue.use(VueTranslate);

import store from './store';
import router from './router';

// ===== Bootstrap components integration (JQuery needed) ======
window.$ = window.jQuery = require('jquery');
require('bootstrap-sass');

// ======================= Base Component ======================
import App from './App';

// ======================== Vue Instance =======================
/* eslint-disable no-new */
new Vue({
  router,
  store,
  el: '#app',
  render: h => h(App),
});
