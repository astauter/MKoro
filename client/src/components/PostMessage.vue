<template>
  <form>
    <div class="form-group">
      <label for="message"><h3>New Message:</h3></label>
      <textarea v-model='message' rows="5" class="form-control" id="message" placeholder="What's on your mind?"></textarea>
    </div>
    <a @click="post" class="btn btn-lg btn-primary">POST</a>
  </form>
</template>


<script>
  export default {
    name: 'PostMessage',
    data () {
      return {
        message : '',
        username : '',
      }
    },
    methods : {
      post () {
        const url = 'http://localhost:8081/message';
        const info = {
          username : localStorage.getItem('username'),
          description : this.message,
          date : new Date(),
        }

        this.$http.post(url, info).then((res) => {
          location.reload();
        }, (err) => {
          console.log(err);
        });
      }
    }
  }
</script>
