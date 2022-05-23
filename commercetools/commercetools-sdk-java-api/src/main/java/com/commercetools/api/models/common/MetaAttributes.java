
package com.commercetools.api.models.common;

import javax.annotation.Nullable;

/**
 * Interface for resources with meta attributes
 */
public interface MetaAttributes {
    @Nullable
    LocalizedString getMetaTitle();

    @Nullable
    LocalizedString getMetaDescription();

    @Nullable
    LocalizedString getMetaKeywords();
}
