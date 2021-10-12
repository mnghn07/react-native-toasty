// ReactNativeToasty.m

#import "ReactNativeToasty.h"
#import "React/RCTLog.h"


@implementation Toasty

double const DURATION = 3.5;

RCT_EXPORT_MODULE(Toasty)

RCT_EXPORT_METHOD(sampleMethod:(NSString *)stringArgument numberParameter:(nonnull NSNumber *)numberArgument callback:(RCTResponseSenderBlock)callback)
{
    // TODO: Implement some actually useful functionality
    callback(@[[NSString stringWithFormat: @"numberArgument: %@ stringArgument: %@", numberArgument, stringArgument]]);
}

RCT_EXPORT_METHOD(toast:(NSString *)message)
{
    RCTLogInfo(@"Testing");
}

@end
