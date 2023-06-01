package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ExternalOAuth;
import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectSetExternalOAuthAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectSetExternalOAuthActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectSetExternalOAuthAction projectSetExternalOAuthAction = ProjectSetExternalOAuthAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProjectSetExternalOAuthActionBuilder implements Builder<ProjectSetExternalOAuthAction> {

    
    @Nullable
    private com.commercetools.api.models.project.ExternalOAuth externalOAuth;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the externalOAuth value
     * @return Builder
     */
    
    public ProjectSetExternalOAuthActionBuilder externalOAuth(Function<com.commercetools.api.models.project.ExternalOAuthBuilder, com.commercetools.api.models.project.ExternalOAuthBuilder> builder) {
        this.externalOAuth = builder.apply(com.commercetools.api.models.project.ExternalOAuthBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the externalOAuth value
     * @return Builder
     */
    
    public ProjectSetExternalOAuthActionBuilder withExternalOAuth(Function<com.commercetools.api.models.project.ExternalOAuthBuilder, com.commercetools.api.models.project.ExternalOAuth> builder) {
        this.externalOAuth = builder.apply(com.commercetools.api.models.project.ExternalOAuthBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param externalOAuth value to be set
     * @return Builder
     */
    
    public ProjectSetExternalOAuthActionBuilder externalOAuth(@Nullable final com.commercetools.api.models.project.ExternalOAuth externalOAuth) {
        this.externalOAuth = externalOAuth;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return externalOAuth
     */
    
    @Nullable
    public com.commercetools.api.models.project.ExternalOAuth getExternalOAuth(){
        return this.externalOAuth;
    }

    /**
     * builds ProjectSetExternalOAuthAction with checking for non-null required values
     * @return ProjectSetExternalOAuthAction
     */
    public ProjectSetExternalOAuthAction build() {
        return new ProjectSetExternalOAuthActionImpl(externalOAuth);
    }
    
    /**
     * builds ProjectSetExternalOAuthAction without checking for non-null required values
     * @return ProjectSetExternalOAuthAction
     */
    public ProjectSetExternalOAuthAction buildUnchecked() {
        return new ProjectSetExternalOAuthActionImpl(externalOAuth);
    }

    /**
     * factory method for an instance of ProjectSetExternalOAuthActionBuilder
     * @return builder 
     */
    public static ProjectSetExternalOAuthActionBuilder of() {
        return new ProjectSetExternalOAuthActionBuilder();
    }

    /**
     * create builder for ProjectSetExternalOAuthAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectSetExternalOAuthActionBuilder of(final ProjectSetExternalOAuthAction template) {
        ProjectSetExternalOAuthActionBuilder builder = new ProjectSetExternalOAuthActionBuilder();
        builder.externalOAuth = template.getExternalOAuth();
        return builder;
    }

}
