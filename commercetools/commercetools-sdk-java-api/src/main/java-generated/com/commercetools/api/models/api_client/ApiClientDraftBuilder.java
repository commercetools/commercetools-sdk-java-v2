package com.commercetools.api.models.api_client;


import com.commercetools.api.models.api_client.ApiClientDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApiClientDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApiClientDraft apiClientDraft = ApiClientDraft.builder()
 *             .name("{name}")
 *             .scope("{scope}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ApiClientDraftBuilder implements Builder<ApiClientDraft> {

    
    
    private String name;
    
    
    
    private String scope;
    
    
    @Nullable
    private Long deleteDaysAfterCreation;
    
    
    @Nullable
    private Integer accessTokenValiditySeconds;
    
    
    @Nullable
    private Integer refreshTokenValiditySeconds;

    
    /**
     *  <p>Name of the APIClient.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public ApiClientDraftBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>Whitespace-separated list of OAuth scopes that can be used when obtaining an access token.</p>
     * @param scope value to be set
     * @return Builder
     */
    
    public ApiClientDraftBuilder scope( final String scope) {
        this.scope = scope;
        return this;
    }
    
    
    
    
    /**
     *  <p>If set, the Client will be deleted after the specified amount of days.</p>
     * @param deleteDaysAfterCreation value to be set
     * @return Builder
     */
    
    public ApiClientDraftBuilder deleteDaysAfterCreation(@Nullable final Long deleteDaysAfterCreation) {
        this.deleteDaysAfterCreation = deleteDaysAfterCreation;
        return this;
    }
    
    
    
    
    /**
     *  <p>Expiration time in seconds for each access token obtained by the APIClient. If not set the default value applies.</p>
     * @param accessTokenValiditySeconds value to be set
     * @return Builder
     */
    
    public ApiClientDraftBuilder accessTokenValiditySeconds(@Nullable final Integer accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
        return this;
    }
    
    
    
    
    /**
     *  <p>Inactivity expiration time in seconds for each refresh token obtained by the APIClient. The expiration time for refresh tokens is restarted each time the token is used. If not set the default value applies.</p>
     * @param refreshTokenValiditySeconds value to be set
     * @return Builder
     */
    
    public ApiClientDraftBuilder refreshTokenValiditySeconds(@Nullable final Integer refreshTokenValiditySeconds) {
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
        return this;
    }
    
    

    /**
     *  <p>Name of the APIClient.</p>
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>Whitespace-separated list of OAuth scopes that can be used when obtaining an access token.</p>
     * @return scope
     */
    
    
    public String getScope(){
        return this.scope;
    }
    
    /**
     *  <p>If set, the Client will be deleted after the specified amount of days.</p>
     * @return deleteDaysAfterCreation
     */
    
    @Nullable
    public Long getDeleteDaysAfterCreation(){
        return this.deleteDaysAfterCreation;
    }
    
    /**
     *  <p>Expiration time in seconds for each access token obtained by the APIClient. If not set the default value applies.</p>
     * @return accessTokenValiditySeconds
     */
    
    @Nullable
    public Integer getAccessTokenValiditySeconds(){
        return this.accessTokenValiditySeconds;
    }
    
    /**
     *  <p>Inactivity expiration time in seconds for each refresh token obtained by the APIClient. The expiration time for refresh tokens is restarted each time the token is used. If not set the default value applies.</p>
     * @return refreshTokenValiditySeconds
     */
    
    @Nullable
    public Integer getRefreshTokenValiditySeconds(){
        return this.refreshTokenValiditySeconds;
    }

    /**
     * builds ApiClientDraft with checking for non-null required values
     * @return ApiClientDraft
     */
    public ApiClientDraft build() {
        Objects.requireNonNull(name, ApiClientDraft.class + ": name is missing");
        Objects.requireNonNull(scope, ApiClientDraft.class + ": scope is missing");
        return new ApiClientDraftImpl(name, scope, deleteDaysAfterCreation, accessTokenValiditySeconds, refreshTokenValiditySeconds);
    }
    
    /**
     * builds ApiClientDraft without checking for non-null required values
     * @return ApiClientDraft
     */
    public ApiClientDraft buildUnchecked() {
        return new ApiClientDraftImpl(name, scope, deleteDaysAfterCreation, accessTokenValiditySeconds, refreshTokenValiditySeconds);
    }

    /**
     * factory method for an instance of ApiClientDraftBuilder
     * @return builder 
     */
    public static ApiClientDraftBuilder of() {
        return new ApiClientDraftBuilder();
    }

    /**
     * create builder for ApiClientDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApiClientDraftBuilder of(final ApiClientDraft template) {
        ApiClientDraftBuilder builder = new ApiClientDraftBuilder();
        builder.name = template.getName();
        builder.scope = template.getScope();
        builder.deleteDaysAfterCreation = template.getDeleteDaysAfterCreation();
        builder.accessTokenValiditySeconds = template.getAccessTokenValiditySeconds();
        builder.refreshTokenValiditySeconds = template.getRefreshTokenValiditySeconds();
        return builder;
    }

}
