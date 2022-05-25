
package com.commercetools.api.models.project;

import java.util.*;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeNameActionBuilder implements Builder<ProjectChangeNameAction> {

    private String name;

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public ProjectChangeNameActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ProjectChangeNameAction build() {
        Objects.requireNonNull(name, ProjectChangeNameAction.class + ": name is missing");
        return new ProjectChangeNameActionImpl(name);
    }

    /**
     * builds ProjectChangeNameAction without checking for non null required values
     */
    public ProjectChangeNameAction buildUnchecked() {
        return new ProjectChangeNameActionImpl(name);
    }

    public static ProjectChangeNameActionBuilder of() {
        return new ProjectChangeNameActionBuilder();
    }

    public static ProjectChangeNameActionBuilder of(final ProjectChangeNameAction template) {
        ProjectChangeNameActionBuilder builder = new ProjectChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
