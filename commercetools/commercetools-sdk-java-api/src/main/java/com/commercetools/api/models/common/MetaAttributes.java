
package com.commercetools.api.models.common;

import javax.annotation.Nullable;

public interface MetaAttributes {
    @Nullable
    LocalizedString getMetaTitle();

    @Nullable
    LocalizedString getMetaDescription();

    @Nullable
    LocalizedString getMetaKeywords();
}
