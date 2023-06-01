package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.AssociateRoleNameChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleNameChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleNameChangedMessagePayload associateRoleNameChangedMessagePayload = AssociateRoleNameChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AssociateRoleNameChangedMessagePayloadBuilder implements Builder<AssociateRoleNameChangedMessagePayload> {

    
    
    private String name;

    
    /**
     *  <p>Updated name of the AssociateRole.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public AssociateRoleNameChangedMessagePayloadBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    

    /**
     *  <p>Updated name of the AssociateRole.</p>
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }

    /**
     * builds AssociateRoleNameChangedMessagePayload with checking for non-null required values
     * @return AssociateRoleNameChangedMessagePayload
     */
    public AssociateRoleNameChangedMessagePayload build() {
        Objects.requireNonNull(name, AssociateRoleNameChangedMessagePayload.class + ": name is missing");
        return new AssociateRoleNameChangedMessagePayloadImpl(name);
    }
    
    /**
     * builds AssociateRoleNameChangedMessagePayload without checking for non-null required values
     * @return AssociateRoleNameChangedMessagePayload
     */
    public AssociateRoleNameChangedMessagePayload buildUnchecked() {
        return new AssociateRoleNameChangedMessagePayloadImpl(name);
    }

    /**
     * factory method for an instance of AssociateRoleNameChangedMessagePayloadBuilder
     * @return builder 
     */
    public static AssociateRoleNameChangedMessagePayloadBuilder of() {
        return new AssociateRoleNameChangedMessagePayloadBuilder();
    }

    /**
     * create builder for AssociateRoleNameChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleNameChangedMessagePayloadBuilder of(final AssociateRoleNameChangedMessagePayload template) {
        AssociateRoleNameChangedMessagePayloadBuilder builder = new AssociateRoleNameChangedMessagePayloadBuilder();
        builder.name = template.getName();
        return builder;
    }

}
