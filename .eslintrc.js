module.exports = {
  root: true,
  extends: '@react-native-community',
  overrides: [
    {
      files: ['*.js'],
      rules: {
        'no-shadow': 'off',
        'no-undef': 'off',
        semi: ['error', 'never'],
      },
    },
  ],
}
