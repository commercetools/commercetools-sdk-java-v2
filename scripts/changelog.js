
const releases = require("../releases.json")

var changeLog = ""
releases.filter((release) => !release.tag_name.startsWith("0") && release.draft == false && release.prerelease == false ).forEach(release => {

  const date = new Date(release.published_at).toISOString().split('T')[0]
  changeLog += `
# ${release.tag_name} (${date})

${release.body}
`

})

console.log(changeLog)

