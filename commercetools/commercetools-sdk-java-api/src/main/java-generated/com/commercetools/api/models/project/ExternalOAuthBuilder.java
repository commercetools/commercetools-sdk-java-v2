package com.commercetools.api.models.project;


import com.commercetools.api.models.project.ExternalOAuth;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExternalOAuthBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExternalOAuth externalOAuth = ExternalOAuth.builder()
 *             .url("{url}")
 *             .authorizationHeader("{authorizationHeader}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ExternalOAuthBuilder implements Builder<ExternalOAuth> {

    
    
    private String url;
    
    
    
    private String authorizationHeader;

    
    /**
     *  <p>URL with authorization header. If the Project is hosted in the China (AWS, Ningxia) Region, verify that the URL is not blocked due to firewall restrictions.</p>
     * @param url value to be set
     * @return Builder
     */
    
    public ExternalOAuthBuilder url( final String url) {
        this.url = url;
        return this;
    }
    
    
    
    
    /**
     *  <p>Must not contain any leading or trailing whitespaces. Partially hidden on retrieval.</p>
     * @param authorizationHeader value to be set
     * @return Builder
     */
    
    public ExternalOAuthBuilder authorizationHeader( final String authorizationHeader) {
        this.authorizationHeader = authorizationHeader;
        return this;
    }
    
    

    /**
     *  <p>URL with authorization header. If the Project is hosted in the China (AWS, Ningxia) Region, verify that the URL is not blocked due to firewall restrictions.</p>
     * @return url
     */
    
    
    public String getUrl(){
        return this.url;
    }
    
    /**
     *  <p>Must not contain any leading or trailing whitespaces. Partially hidden on retrieval.</p>
     * @return authorizationHeader
     */
    
    
    public String getAuthorizationHeader(){
        return this.authorizationHeader;
    }

    /**
     * builds ExternalOAuth with checking for non-null required values
     * @return ExternalOAuth
     */
    public ExternalOAuth build() {
        Objects.requireNonNull(url, ExternalOAuth.class + ": url is missing");
        Objects.requireNonNull(authorizationHeader, ExternalOAuth.class + ": authorizationHeader is missing");
        return new ExternalOAuthImpl(url, authorizationHeader);
    }
    
    /**
     * builds ExternalOAuth without checking for non-null required values
     * @return ExternalOAuth
     */
    public ExternalOAuth buildUnchecked() {
        return new ExternalOAuthImpl(url, authorizationHeader);
    }

    /**
     * factory method for an instance of ExternalOAuthBuilder
     * @return builder 
     */
    public static ExternalOAuthBuilder of() {
        return new ExternalOAuthBuilder();
    }

    /**
     * create builder for ExternalOAuth instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExternalOAuthBuilder of(final ExternalOAuth template) {
        ExternalOAuthBuilder builder = new ExternalOAuthBuilder();
        builder.url = template.getUrl();
        builder.authorizationHeader = template.getAuthorizationHeader();
        return builder;
    }

}
