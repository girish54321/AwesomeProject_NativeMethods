import React from 'react';
import {
  SafeAreaView, Text, NativeModules, Platform
} from 'react-native';

function App(): JSX.Element {

  let buildInfo = NativeModules.ConfigModule.getConstants()

  return (
    <SafeAreaView style={{ flex: 1, alignSelf: 'center', alignContent: 'center', justifyContent: 'center' }}>
      <Text>{Platform.OS}</Text>
      <Text style={{ fontSize: 60 }}>{buildInfo.BUILD_ENV}</Text>
      <Text style={{ fontSize: 22 }}>{buildInfo.BASE_URL}</Text>
    </SafeAreaView>
  );
}

export default App;
