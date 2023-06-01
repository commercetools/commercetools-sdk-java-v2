package com.commercetools.api.models.associate_role;

import com.commercetools.api.models.associate_role.AssociateRoleUpdateAction;
import com.commercetools.api.models.associate_role.AssociateRoleSetNameAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleSetNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleSetNameAction associateRoleSetNameAction = AssociateRoleSetNameAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AssociateRoleSetNameActionBuilder implements Builder<AssociateRoleSetNameAction> {

    
    @Nullable
    private String name;

    
    /**
     *  <p>New name to set. If <code>name</code> is absent or <code>null</code>, the existing name, if any, will be removed.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public AssociateRoleSetNameActionBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }
    
    

    /**
     *  <p>New name to set. If <code>name</code> is absent or <code>null</code>, the existing name, if any, will be removed.</p>
     * @return name
     */
    
    @Nullable
    public String getName(){
        return this.name;
    }

    /**
     * builds AssociateRoleSetNameAction with checking for non-null required values
     * @return AssociateRoleSetNameAction
     */
    public AssociateRoleSetNameAction build() {
        return new AssociateRoleSetNameActionImpl(name);
    }
    
    /**
     * builds AssociateRoleSetNameAction without checking for non-null required values
     * @return AssociateRoleSetNameAction
     */
    public AssociateRoleSetNameAction buildUnchecked() {
        return new AssociateRoleSetNameActionImpl(name);
    }

    /**
     * factory method for an instance of AssociateRoleSetNameActionBuilder
     * @return builder 
     */
    public static AssociateRoleSetNameActionBuilder of() {
        return new AssociateRoleSetNameActionBuilder();
    }

    /**
     * create builder for AssociateRoleSetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleSetNameActionBuilder of(final AssociateRoleSetNameAction template) {
        AssociateRoleSetNameActionBuilder builder = new AssociateRoleSetNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
