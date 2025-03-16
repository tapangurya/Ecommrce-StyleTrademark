
package com.styletrademark.ecommerce.dto;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
@ConfigurationProperties(prefix = "cloudinary")
public class CloudinaryConfig {
    private String cloudName;
    private String key;
    private String secret;

}
