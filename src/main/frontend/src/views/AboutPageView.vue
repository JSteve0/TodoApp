<template>
  <v-layout justify-center align-center>

    <v-card justify="center" min-width="200px">

      <v-card-title class="justify-center">
        About Page
      </v-card-title>

      <v-card-actions>
        <v-row justify="center">
          <v-btn
              @click="redirect('/')"
              class="mb-5"
          >
            Home Page
          </v-btn>
        </v-row>
      </v-card-actions>

    </v-card>

  </v-layout>
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
