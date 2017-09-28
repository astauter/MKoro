<template>
  <div id="app">
    <div class="overlay">
      <div class="container">
        <navbar></navbar>
        <router-view id="router-view"></router-view>
      </div>
    </div>
  </div>
</template>

<script>
import Navbar from './components/Navbar';
import MainPanel from './components/MainPanel';
import Signup from './components/Signup';
import Login from './components/Login';
import PostMessage from './components/PostMessage';
import Welcome from './components/Welcome';

export default {
  components: { Navbar, MainPanel, Signup, Login, PostMessage, Welcome },
};
</script>

<style lang="sass">

  // Bootstrap
  $icon-font-path: '../node_modules/bootstrap-sass/assets/fonts/bootstrap/';
  $link-color: #42b983;
  $brand-success: #42b983;
  @import 'node_modules/bootstrap-sass/assets/stylesheets/bootstrap';

  // font awesome
  $fa-font-path: '../node_modules/font-awesome/fonts/';
  @import 'node_modules/font-awesome/scss/font-awesome';

  //some styling adaptations
  h1
    color: #42b983
  p
    text-align: justify
  #router-view
    margin-top: 80px

  #app,html,body
    height: 100%
    background: linear-gradient(rgba(0, 0, 100, 0.45), rgba(0, 0, 100, 0.45)), url('https://idwgames.com/wp-content/uploads/2014/09/machi-koro.jpg')
    background-repeat: no-repeat
    background-attachment: fixed
</style>
