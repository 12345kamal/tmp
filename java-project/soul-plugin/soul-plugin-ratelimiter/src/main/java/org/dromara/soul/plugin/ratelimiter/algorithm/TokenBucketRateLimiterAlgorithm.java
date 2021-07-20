/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.soul.plugin.ratelimiter.algorithm;

import org.dromara.soul.spi.Join;

/**
 * The type Token bucket rate limiter algorithm.
 * See https://stripe.com/blog/rate-limiters and
 * https://gist.github.com/ptarjan/e38f45f2dfe601419ca3af937fff574d#file-1-check_request_rate_limiter-rb-L11-L34
 * 
 * @author xiaoyu
 */
@Join
public class TokenBucketRateLimiterAlgorithm extends AbstractRateLimiterAlgorithm {
    
    @Override
    protected String getScriptName() {
        return "request_rate_limiter.lua";
    }
    
    @Override
    protected String getKeyName() {
        return "request_rate_limiter";
    }
}
