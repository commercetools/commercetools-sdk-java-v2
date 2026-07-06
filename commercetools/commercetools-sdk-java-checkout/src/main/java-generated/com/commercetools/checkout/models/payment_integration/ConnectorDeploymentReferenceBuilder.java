
package com.commercetools.checkout.models.payment_integration;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ConnectorDeploymentReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ConnectorDeploymentReference connectorDeploymentReference = ConnectorDeploymentReference.builder()
 *             .id("{id}")
 *             .typeId("{typeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ConnectorDeploymentReferenceBuilder implements Builder<ConnectorDeploymentReference> {

    private String id;

    private String typeId;

    /**
     *  <p>Unique identifier of the referenced Connect Deployment.</p>
     * @param id value to be set
     * @return Builder
     */

    public ConnectorDeploymentReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Type identifier, always <code>deployment</code> for Connector deployment references.</p>
     * @param typeId value to be set
     * @return Builder
     */

    public ConnectorDeploymentReferenceBuilder typeId(final String typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced Connect Deployment.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Type identifier, always <code>deployment</code> for Connector deployment references.</p>
     * @return typeId
     */

    public String getTypeId() {
        return this.typeId;
    }

    /**
     * builds ConnectorDeploymentReference with checking for non-null required values
     * @return ConnectorDeploymentReference
     */
    public ConnectorDeploymentReference build() {
        Objects.requireNonNull(id, ConnectorDeploymentReference.class + ": id is missing");
        Objects.requireNonNull(typeId, ConnectorDeploymentReference.class + ": typeId is missing");
        return new ConnectorDeploymentReferenceImpl(id, typeId);
    }

    /**
     * builds ConnectorDeploymentReference without checking for non-null required values
     * @return ConnectorDeploymentReference
     */
    public ConnectorDeploymentReference buildUnchecked() {
        return new ConnectorDeploymentReferenceImpl(id, typeId);
    }

    /**
     * factory method for an instance of ConnectorDeploymentReferenceBuilder
     * @return builder
     */
    public static ConnectorDeploymentReferenceBuilder of() {
        return new ConnectorDeploymentReferenceBuilder();
    }

    /**
     * create builder for ConnectorDeploymentReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ConnectorDeploymentReferenceBuilder of(final ConnectorDeploymentReference template) {
        ConnectorDeploymentReferenceBuilder builder = new ConnectorDeploymentReferenceBuilder();
        builder.id = template.getId();
        builder.typeId = template.getTypeId();
        return builder;
    }

}
