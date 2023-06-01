package com.commercetools.api.models.me;


import com.commercetools.api.models.me.MyOrderFromCartDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyOrderFromCartDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyOrderFromCartDraft myOrderFromCartDraft = MyOrderFromCartDraft.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyOrderFromCartDraftBuilder implements Builder<MyOrderFromCartDraft> {

    
    
    private String id;
    
    
    
    private Long version;

    
    /**
     *  <p>Unique identifier of the Cart that initiates an Order creation.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public MyOrderFromCartDraftBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     * set the value to the version
     * @param version value to be set
     * @return Builder
     */
    
    public MyOrderFromCartDraftBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the Cart that initiates an Order creation.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     * value of version}
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }

    /**
     * builds MyOrderFromCartDraft with checking for non-null required values
     * @return MyOrderFromCartDraft
     */
    public MyOrderFromCartDraft build() {
        Objects.requireNonNull(id, MyOrderFromCartDraft.class + ": id is missing");
        Objects.requireNonNull(version, MyOrderFromCartDraft.class + ": version is missing");
        return new MyOrderFromCartDraftImpl(id, version);
    }
    
    /**
     * builds MyOrderFromCartDraft without checking for non-null required values
     * @return MyOrderFromCartDraft
     */
    public MyOrderFromCartDraft buildUnchecked() {
        return new MyOrderFromCartDraftImpl(id, version);
    }

    /**
     * factory method for an instance of MyOrderFromCartDraftBuilder
     * @return builder 
     */
    public static MyOrderFromCartDraftBuilder of() {
        return new MyOrderFromCartDraftBuilder();
    }

    /**
     * create builder for MyOrderFromCartDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyOrderFromCartDraftBuilder of(final MyOrderFromCartDraft template) {
        MyOrderFromCartDraftBuilder builder = new MyOrderFromCartDraftBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        return builder;
    }

}
