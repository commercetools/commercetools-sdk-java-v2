
const releases = require("../releases.json")

var changeLog = ""
releases.filter((release) => !release.tag_name.startsWith("0") && release.draft == false && release.prerelease == false ).forEach(release => {

  changeLog += `
# ${release.tag_name} (${release.published_at})

${release.body}
`

})

console.log(changeLog)

