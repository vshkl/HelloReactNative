import React from 'react'
import {StyleSheet, View} from 'react-native'

import HelloWorld from './HelloWorld'

const App = () => {
  return (
    <View style={styles.container}>
      <HelloWorld style={styles.helloWorld} />
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  helloWorld: {
    width: 100,
    height: 100,
  },
})

export default App
