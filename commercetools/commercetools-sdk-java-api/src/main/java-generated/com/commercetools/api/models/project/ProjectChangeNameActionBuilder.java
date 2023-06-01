package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectChangeNameAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeNameAction projectChangeNameAction = ProjectChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProjectChangeNameActionBuilder implements Builder<ProjectChangeNameAction> {

    
    
    private String name;

    
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public ProjectChangeNameActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }

    /**
     * builds ProjectChangeNameAction with checking for non-null required values
     * @return ProjectChangeNameAction
     */
    public ProjectChangeNameAction build() {
        Objects.requireNonNull(name, ProjectChangeNameAction.class + ": name is missing");
        return new ProjectChangeNameActionImpl(name);
    }
    
    /**
     * builds ProjectChangeNameAction without checking for non-null required values
     * @return ProjectChangeNameAction
     */
    public ProjectChangeNameAction buildUnchecked() {
        return new ProjectChangeNameActionImpl(name);
    }

    /**
     * factory method for an instance of ProjectChangeNameActionBuilder
     * @return builder 
     */
    public static ProjectChangeNameActionBuilder of() {
        return new ProjectChangeNameActionBuilder();
    }

    /**
     * create builder for ProjectChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeNameActionBuilder of(final ProjectChangeNameAction template) {
        ProjectChangeNameActionBuilder builder = new ProjectChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
