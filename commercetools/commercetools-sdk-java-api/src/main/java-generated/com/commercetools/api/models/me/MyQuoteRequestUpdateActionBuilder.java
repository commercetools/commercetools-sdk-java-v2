package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyQuoteRequestCancelAction;
import com.commercetools.api.models.me.MyQuoteRequestUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyQuoteRequestUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyQuoteRequestUpdateActionBuilder {

    public com.commercetools.api.models.me.MyQuoteRequestCancelActionBuilder cancelQuoteRequestBuilder() {
       return com.commercetools.api.models.me.MyQuoteRequestCancelActionBuilder.of();
    }

    /**
     * factory method for an instance of MyQuoteRequestUpdateActionBuilder
     * @return builder 
     */
    public static MyQuoteRequestUpdateActionBuilder of() {
        return new MyQuoteRequestUpdateActionBuilder();
    }

}
