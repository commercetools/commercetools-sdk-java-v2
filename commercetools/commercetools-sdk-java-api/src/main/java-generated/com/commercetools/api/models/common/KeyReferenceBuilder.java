package com.commercetools.api.models.common;

import com.commercetools.api.models.associate_role.AssociateRoleKeyReference;
import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.common.KeyReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * KeyReferenceBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class KeyReferenceBuilder {

    public com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder associateRoleBuilder() {
       return com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder businessUnitBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of();
    }
    public com.commercetools.api.models.store.StoreKeyReferenceBuilder storeBuilder() {
       return com.commercetools.api.models.store.StoreKeyReferenceBuilder.of();
    }

    /**
     * factory method for an instance of KeyReferenceBuilder
     * @return builder 
     */
    public static KeyReferenceBuilder of() {
        return new KeyReferenceBuilder();
    }

}
