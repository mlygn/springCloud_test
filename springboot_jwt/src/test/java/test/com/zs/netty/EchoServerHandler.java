package test.com.zs.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @author zs
 * @date 2021/2/23 21:29
 */
public class EchoServerHandler extends ChannelInboundHandlerAdapter {

    /**
     * channelInboundHandlerAdapter 和channelOutBoundHandlerAdapter区别
     * @param ctx
     * @param msg
     * @throws Exception
     */

    int counter = 0;
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        String body = (String)msg;
        System.out.println("This is"+ ++counter +"times receive client:["+body+"]");
        body += "$_";
        ByteBuf echo = Unpooled.copiedBuffer(body.getBytes());
        ctx.fireChannelRead(echo);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        //发生异常，关闭链路
        ctx.close();
    }
}
