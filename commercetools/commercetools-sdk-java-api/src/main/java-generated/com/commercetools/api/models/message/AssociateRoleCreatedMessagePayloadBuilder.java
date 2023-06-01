package com.commercetools.api.models.message;

import com.commercetools.api.models.associate_role.AssociateRole;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.AssociateRoleCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleCreatedMessagePayload associateRoleCreatedMessagePayload = AssociateRoleCreatedMessagePayload.builder()
 *             .associateRole(associateRoleBuilder -> associateRoleBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AssociateRoleCreatedMessagePayloadBuilder implements Builder<AssociateRoleCreatedMessagePayload> {

    
    
    private com.commercetools.api.models.associate_role.AssociateRole associateRole;

    
    /**
     *  <p>The AssociateRole that was created.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */
    
    public AssociateRoleCreatedMessagePayloadBuilder associateRole(Function<com.commercetools.api.models.associate_role.AssociateRoleBuilder, com.commercetools.api.models.associate_role.AssociateRoleBuilder> builder) {
        this.associateRole = builder.apply(com.commercetools.api.models.associate_role.AssociateRoleBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The AssociateRole that was created.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */
    
    public AssociateRoleCreatedMessagePayloadBuilder withAssociateRole(Function<com.commercetools.api.models.associate_role.AssociateRoleBuilder, com.commercetools.api.models.associate_role.AssociateRole> builder) {
        this.associateRole = builder.apply(com.commercetools.api.models.associate_role.AssociateRoleBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The AssociateRole that was created.</p>
     * @param associateRole value to be set
     * @return Builder
     */
    
    public AssociateRoleCreatedMessagePayloadBuilder associateRole( final com.commercetools.api.models.associate_role.AssociateRole associateRole) {
        this.associateRole = associateRole;
        return this;
    }
    
    

    /**
     *  <p>The AssociateRole that was created.</p>
     * @return associateRole
     */
    
    
    public com.commercetools.api.models.associate_role.AssociateRole getAssociateRole(){
        return this.associateRole;
    }

    /**
     * builds AssociateRoleCreatedMessagePayload with checking for non-null required values
     * @return AssociateRoleCreatedMessagePayload
     */
    public AssociateRoleCreatedMessagePayload build() {
        Objects.requireNonNull(associateRole, AssociateRoleCreatedMessagePayload.class + ": associateRole is missing");
        return new AssociateRoleCreatedMessagePayloadImpl(associateRole);
    }
    
    /**
     * builds AssociateRoleCreatedMessagePayload without checking for non-null required values
     * @return AssociateRoleCreatedMessagePayload
     */
    public AssociateRoleCreatedMessagePayload buildUnchecked() {
        return new AssociateRoleCreatedMessagePayloadImpl(associateRole);
    }

    /**
     * factory method for an instance of AssociateRoleCreatedMessagePayloadBuilder
     * @return builder 
     */
    public static AssociateRoleCreatedMessagePayloadBuilder of() {
        return new AssociateRoleCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for AssociateRoleCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleCreatedMessagePayloadBuilder of(final AssociateRoleCreatedMessagePayload template) {
        AssociateRoleCreatedMessagePayloadBuilder builder = new AssociateRoleCreatedMessagePayloadBuilder();
        builder.associateRole = template.getAssociateRole();
        return builder;
    }

}
