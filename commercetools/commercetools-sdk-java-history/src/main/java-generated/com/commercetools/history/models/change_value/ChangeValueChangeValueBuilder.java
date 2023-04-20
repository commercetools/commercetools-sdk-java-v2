
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeValueChangeValueBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeValueChangeValueBuilder {

    public com.commercetools.history.models.change_value.ChangeValueAbsoluteChangeValueBuilder absoluteBuilder() {
        return com.commercetools.history.models.change_value.ChangeValueAbsoluteChangeValueBuilder.of();
    }

    public com.commercetools.history.models.change_value.ChangeValueExternalChangeValueBuilder externalBuilder() {
        return com.commercetools.history.models.change_value.ChangeValueExternalChangeValueBuilder.of();
    }

    public com.commercetools.history.models.change_value.ChangeValueGiftLineItemChangeValueBuilder giftLineItemBuilder() {
        return com.commercetools.history.models.change_value.ChangeValueGiftLineItemChangeValueBuilder.of();
    }

    public com.commercetools.history.models.change_value.ChangeValueRelativeChangeValueBuilder relativeBuilder() {
        return com.commercetools.history.models.change_value.ChangeValueRelativeChangeValueBuilder.of();
    }

    /**
     * factory method for an instance of ChangeValueChangeValueBuilder
     * @return builder
     */
    public static ChangeValueChangeValueBuilder of() {
        return new ChangeValueChangeValueBuilder();
    }

}
