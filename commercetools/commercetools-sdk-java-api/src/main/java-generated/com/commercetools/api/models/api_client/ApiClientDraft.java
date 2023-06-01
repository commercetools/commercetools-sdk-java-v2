package com.commercetools.api.models.api_client;


import com.commercetools.api.models.api_client.ApiClientDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * ApiClientDraft
 *
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
@JsonDeserialize(as = ApiClientDraftImpl.class)
public interface ApiClientDraft extends io.vrap.rmf.base.client.Draft<ApiClientDraft> {


    /**
     *  <p>Name of the APIClient.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
     *  <p>Whitespace-separated list of OAuth scopes that can be used when obtaining an access token.</p>
     * @return scope
     */
    @NotNull
    @JsonProperty("scope")
    public String getScope();
    /**
     *  <p>If set, the Client will be deleted after the specified amount of days.</p>
     * @return deleteDaysAfterCreation
     */
    
    @JsonProperty("deleteDaysAfterCreation")
    public Long getDeleteDaysAfterCreation();
    /**
     *  <p>Expiration time in seconds for each access token obtained by the APIClient. If not set the default value applies.</p>
     * @return accessTokenValiditySeconds
     */
    
    @JsonProperty("accessTokenValiditySeconds")
    public Integer getAccessTokenValiditySeconds();
    /**
     *  <p>Inactivity expiration time in seconds for each refresh token obtained by the APIClient. The expiration time for refresh tokens is restarted each time the token is used. If not set the default value applies.</p>
     * @return refreshTokenValiditySeconds
     */
    
    @JsonProperty("refreshTokenValiditySeconds")
    public Integer getRefreshTokenValiditySeconds();

    /**
     *  <p>Name of the APIClient.</p>
     * @param name value to be set
     */
    
    public void setName(final String name);
    
    
    /**
     *  <p>Whitespace-separated list of OAuth scopes that can be used when obtaining an access token.</p>
     * @param scope value to be set
     */
    
    public void setScope(final String scope);
    
    
    /**
     *  <p>If set, the Client will be deleted after the specified amount of days.</p>
     * @param deleteDaysAfterCreation value to be set
     */
    
    public void setDeleteDaysAfterCreation(final Long deleteDaysAfterCreation);
    
    
    /**
     *  <p>Expiration time in seconds for each access token obtained by the APIClient. If not set the default value applies.</p>
     * @param accessTokenValiditySeconds value to be set
     */
    
    public void setAccessTokenValiditySeconds(final Integer accessTokenValiditySeconds);
    
    
    /**
     *  <p>Inactivity expiration time in seconds for each refresh token obtained by the APIClient. The expiration time for refresh tokens is restarted each time the token is used. If not set the default value applies.</p>
     * @param refreshTokenValiditySeconds value to be set
     */
    
    public void setRefreshTokenValiditySeconds(final Integer refreshTokenValiditySeconds);
    

    /**
     * factory method
     * @return instance of ApiClientDraft
     */
    public static ApiClientDraft of(){
        return new ApiClientDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy ApiClientDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApiClientDraft of(final ApiClientDraft template) {
        ApiClientDraftImpl instance = new ApiClientDraftImpl();
        instance.setName(template.getName());
        instance.setScope(template.getScope());
        instance.setDeleteDaysAfterCreation(template.getDeleteDaysAfterCreation());
        instance.setAccessTokenValiditySeconds(template.getAccessTokenValiditySeconds());
        instance.setRefreshTokenValiditySeconds(template.getRefreshTokenValiditySeconds());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApiClientDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApiClientDraft deepCopy(@Nullable final ApiClientDraft template) {
        if (template == null) {
            return null;
        }
        ApiClientDraftImpl instance = new ApiClientDraftImpl();
        instance.setName(template.getName());
        instance.setScope(template.getScope());
        instance.setDeleteDaysAfterCreation(template.getDeleteDaysAfterCreation());
        instance.setAccessTokenValiditySeconds(template.getAccessTokenValiditySeconds());
        instance.setRefreshTokenValiditySeconds(template.getRefreshTokenValiditySeconds());
        return instance;
    }

    /**
     * builder factory method for ApiClientDraft
     * @return builder
     */
    public static ApiClientDraftBuilder builder() {
        return ApiClientDraftBuilder.of();
    }
    
    /**
     * create builder for ApiClientDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApiClientDraftBuilder builder(final ApiClientDraft template) {
        return ApiClientDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApiClientDraft(Function<ApiClientDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApiClientDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApiClientDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ApiClientDraft>";
            }
        };
    }
}
