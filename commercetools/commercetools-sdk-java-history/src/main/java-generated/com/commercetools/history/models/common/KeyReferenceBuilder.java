
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * KeyReferenceBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class KeyReferenceBuilder {

    public com.commercetools.history.models.common.AssociateRoleKeyReferenceBuilder associateRoleBuilder() {
        return com.commercetools.history.models.common.AssociateRoleKeyReferenceBuilder.of();
    }

    public com.commercetools.history.models.common.BusinessUnitKeyReferenceBuilder businessUnitBuilder() {
        return com.commercetools.history.models.common.BusinessUnitKeyReferenceBuilder.of();
    }

    public com.commercetools.history.models.common.StoreKeyReferenceBuilder storeBuilder() {
        return com.commercetools.history.models.common.StoreKeyReferenceBuilder.of();
    }

    /**
     * factory method for an instance of KeyReferenceBuilder
     * @return builder
     */
    public static KeyReferenceBuilder of() {
        return new KeyReferenceBuilder();
    }

}
