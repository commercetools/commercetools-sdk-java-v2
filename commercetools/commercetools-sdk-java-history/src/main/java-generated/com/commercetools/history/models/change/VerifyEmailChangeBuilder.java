package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.VerifyEmailChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VerifyEmailChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VerifyEmailChange verifyEmailChange = VerifyEmailChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class VerifyEmailChangeBuilder implements Builder<VerifyEmailChange> {

    
    
    private String change;

    
    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */
    
    public VerifyEmailChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    

    /**
     * value of change}
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }

    /**
     * builds VerifyEmailChange with checking for non-null required values
     * @return VerifyEmailChange
     */
    public VerifyEmailChange build() {
        Objects.requireNonNull(change, VerifyEmailChange.class + ": change is missing");
        return new VerifyEmailChangeImpl(change);
    }
    
    /**
     * builds VerifyEmailChange without checking for non-null required values
     * @return VerifyEmailChange
     */
    public VerifyEmailChange buildUnchecked() {
        return new VerifyEmailChangeImpl(change);
    }

    /**
     * factory method for an instance of VerifyEmailChangeBuilder
     * @return builder 
     */
    public static VerifyEmailChangeBuilder of() {
        return new VerifyEmailChangeBuilder();
    }

    /**
     * create builder for VerifyEmailChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VerifyEmailChangeBuilder of(final VerifyEmailChange template) {
        VerifyEmailChangeBuilder builder = new VerifyEmailChangeBuilder();
        builder.change = template.getChange();
        return builder;
    }

}
