import React from "react";
import { StyleSheet, Text, View } from "react-native";


const styles = StyleSheet.create({
    container: {
      flex: 1,
      justifyContent: 'center',
    },
    hello: {
      fontSize: 20,
      textAlign: 'center',
      margin: 10,
    },
  });

export class HelloWorld extends React.Component {
    render() {
        return (
            <View style={styles.container}>
                <Text style={styles.hello}>Hello, World React nihaoya </Text>
            </View>
        );
    };
}

