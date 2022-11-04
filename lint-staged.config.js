module.exports = {
  '**/*.java': (filenames) => {
    return './gradlew spotlessApply'
  }
};
