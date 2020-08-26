package com.commercetools.api.models.message;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ProductSlugChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSlugChangedMessagePayloadBuilder {

    
    private com.commercetools.api.models.common.LocalizedString slug;

    public ProductSlugChangedMessagePayloadBuilder slug( final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    
    public com.commercetools.api.models.common.LocalizedString getSlug(){
        return this.slug;
    }

    public ProductSlugChangedMessagePayload build() {
        return new ProductSlugChangedMessagePayloadImpl(slug);
    }

    public static ProductSlugChangedMessagePayloadBuilder of() {
        return new ProductSlugChangedMessagePayloadBuilder();
    }

    public static ProductSlugChangedMessagePayloadBuilder of(final ProductSlugChangedMessagePayload template) {
        ProductSlugChangedMessagePayloadBuilder builder = new ProductSlugChangedMessagePayloadBuilder();
        builder.slug = template.getSlug();
        return builder;
    }

}
