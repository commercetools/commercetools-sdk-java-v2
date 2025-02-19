
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleNameSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleNameSetMessagePayload associateRoleNameSetMessagePayload = AssociateRoleNameSetMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleNameSetMessagePayloadBuilder implements Builder<AssociateRoleNameSetMessagePayload> {

    private String name;

    /**
     *  <p>Updated name of the AssociateRole.</p>
     * @param name value to be set
     * @return Builder
     */

    public AssociateRoleNameSetMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Updated name of the AssociateRole.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds AssociateRoleNameSetMessagePayload with checking for non-null required values
     * @return AssociateRoleNameSetMessagePayload
     */
    public AssociateRoleNameSetMessagePayload build() {
        Objects.requireNonNull(name, AssociateRoleNameSetMessagePayload.class + ": name is missing");
        return new AssociateRoleNameSetMessagePayloadImpl(name);
    }

    /**
     * builds AssociateRoleNameSetMessagePayload without checking for non-null required values
     * @return AssociateRoleNameSetMessagePayload
     */
    public AssociateRoleNameSetMessagePayload buildUnchecked() {
        return new AssociateRoleNameSetMessagePayloadImpl(name);
    }

    /**
     * factory method for an instance of AssociateRoleNameSetMessagePayloadBuilder
     * @return builder
     */
    public static AssociateRoleNameSetMessagePayloadBuilder of() {
        return new AssociateRoleNameSetMessagePayloadBuilder();
    }

    /**
     * create builder for AssociateRoleNameSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleNameSetMessagePayloadBuilder of(final AssociateRoleNameSetMessagePayload template) {
        AssociateRoleNameSetMessagePayloadBuilder builder = new AssociateRoleNameSetMessagePayloadBuilder();
        builder.name = template.getName();
        return builder;
    }

}
