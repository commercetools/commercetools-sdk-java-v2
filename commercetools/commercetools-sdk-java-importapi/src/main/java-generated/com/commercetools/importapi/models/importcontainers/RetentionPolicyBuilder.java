
package com.commercetools.importapi.models.importcontainers;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RetentionPolicyBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RetentionPolicyBuilder {

    public com.commercetools.importapi.models.importcontainers.TimeToLiveRetentionPolicyBuilder ttlBuilder() {
        return com.commercetools.importapi.models.importcontainers.TimeToLiveRetentionPolicyBuilder.of();
    }

    /**
     * factory method for an instance of RetentionPolicyBuilder
     * @return builder
     */
    public static RetentionPolicyBuilder of() {
        return new RetentionPolicyBuilder();
    }

}
