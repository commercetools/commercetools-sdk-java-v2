package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.AssociateRoleDeletedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleDeletedMessagePayload associateRoleDeletedMessagePayload = AssociateRoleDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AssociateRoleDeletedMessagePayloadBuilder implements Builder<AssociateRoleDeletedMessagePayload> {




    /**
     * builds AssociateRoleDeletedMessagePayload with checking for non-null required values
     * @return AssociateRoleDeletedMessagePayload
     */
    public AssociateRoleDeletedMessagePayload build() {
        return new AssociateRoleDeletedMessagePayloadImpl();
    }
    
    /**
     * builds AssociateRoleDeletedMessagePayload without checking for non-null required values
     * @return AssociateRoleDeletedMessagePayload
     */
    public AssociateRoleDeletedMessagePayload buildUnchecked() {
        return new AssociateRoleDeletedMessagePayloadImpl();
    }

    /**
     * factory method for an instance of AssociateRoleDeletedMessagePayloadBuilder
     * @return builder 
     */
    public static AssociateRoleDeletedMessagePayloadBuilder of() {
        return new AssociateRoleDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for AssociateRoleDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleDeletedMessagePayloadBuilder of(final AssociateRoleDeletedMessagePayload template) {
        AssociateRoleDeletedMessagePayloadBuilder builder = new AssociateRoleDeletedMessagePayloadBuilder();
        return builder;
    }

}
