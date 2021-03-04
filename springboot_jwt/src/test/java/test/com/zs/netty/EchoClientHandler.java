package test.com.zs.netty;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelOutboundHandlerAdapter;

/**
 * @author zs
 * @date 2021/2/23 21:30
 */
public class EchoClientHandler extends ChannelInboundHandlerAdapter {
    private int counter;
    static final String ECHO_REQ = "Hi,zhangshun,welcome to my netty.$_";


    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        for(int i = 0;i<=10;i++){
            ctx.writeAndFlush(Unpooled.copiedBuffer(ECHO_REQ.getBytes()));
        }
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("This is"+ ++counter + "times receive server:["+msg+"]");
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
