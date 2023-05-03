
package io.vrap.rmf.base.client;

/**
 *
 * Marker interface to generate a solution info for the Java SDK user agent.
 *
 * <p>A User-Agent header with a solution information looks like this:
 * {@code commercetools-sdk-java-v2/1.4.1 Java/1.8.0_92-b14 (Mac OS X; x86_64) SOLUTION_NAME/SOLUTION_VERSION (+https://website.tld; +info@SOLUTION.com)}</p>
 *
 * <p>To add a solution information to the Java SDK create a resource file {@code src/main/resources/META-INF/services/io.vrap.rmf.base.client.SolutionInfo}
 * which contains a fully qualified class name like (replace at least SOLUTION with your solution name)
 * {@code tld.SOLUTION.client.SOLUTIONSolutionInfo}</p>
 *
 * Then create a class {@code tld.SOLUTION.client.SOLUTIONSolutionInfo}:
 *
 <pre>
 {@code
     public class SOLUTIONSolutionInfo extends SolutionInfo {
         public SOLUTIONSolutionInfo() {
             setName("Java-SDK-integration-tests");
             setVersion(BuildInfo.version());
             setWebsite("https://github.com/commercetools/commercetools-sdk-java-v2");
             setEmergencyContact("helpdesk@commercetools.com");
         }
     }
 }
 </pre>

 This class will be loaded via reflection.
 *
 */
public class SolutionInfo implements ModelBase {
    private String name;
    private String version;
    private String website;
    private String emergencyContact;

    public SolutionInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(final String website) {
        this.website = website;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(final String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }
}
