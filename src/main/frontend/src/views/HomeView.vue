<template>
  <div align="center">
    <h1 class="mt-12 pt-12">Hello World</h1>
    <h2 class="my-4">The cheese sticks</h2>
    <h3 class="my-4">Authors</h3>
    <v-divider class="mb-4" width="500px"></v-divider>
    <h4 class="mb-4">Justin Stevens, Jon Brennan, Tim Brennan</h4>
    <v-divider class="mb-4" width="500px"></v-divider>
    <v-btn class="my-12" @click="redirect('about')">About Page</v-btn>
  </div>
</template>

<script>
  export default {
    methods: {
      redirect(link) {
        this.$router.push(link);
      }
    }
  }
</script>