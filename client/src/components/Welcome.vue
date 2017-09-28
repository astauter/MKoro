<template>
  <div id='welcome' class='container'>
    <h1>Welcome to Mochi Koro</h1>
      <input
        placeholder="game id"
        name="gameId"
        type="gameId"
        className="form-control"
        onBlur={this.getGame}
        required
        autoFocus
      />
      <input
        placeholder="player name"
        name="playerName"
        type="playerName"
        className="form-control"
        onBlur={this.getUser}
        required
        autoFocus
      />
      <a class="btn btn-primary btn-block" @click="login">Continue Game</a>
      <a class="btn btn-primary btn-block" @click="newGame"><router-link to="/" >Home</router-link></a>
  </div>
</template>

<script type="text/javascript">
  export default {
    name: 'welcome',
    data() {
      return {}
    },
    methods: {
      login() {},
      newGame() {}
    }
  }
</script>

<style type="text/scss">

  #welcome {
    background: rgba(0, 0, 0, 0.8);
    padding: 30px 10% 60px 10%;
  }

  #welcome > * {
    width: 100%;
    margin-bottom: 3%;
    text-align: center;
  }
</style>