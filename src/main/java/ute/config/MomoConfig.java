// MomoConfig.java
package ute.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MomoConfig {
    public static final String PARTNER_CODE = "MOMO";
    public static final String ACCESS_KEY = "F8BBA842ECF85";
    public static final String SECRET_KEY = "K951B6PE1waDMi640xX08PD3vg6EkVlz";
    public static final String REQUEST_TYPE = "payWithMethod";
    public static final String REDIRECT_URL = "https://web-sach-tre0-8-fe.vercel.app/payment_return";
    public static final String IPN_URL = "https://manga-m8n9.onrender.com/orders/momo_return";
    public static final String ENDPOINT = "https://test-payment.momo.vn/v2/gateway/api/create";
}