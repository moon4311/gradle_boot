<template>
    <div>
        <div class="crumbs">
            <el-breadcrumb separator="/">
                <el-breadcrumb-item><i class="el-icon-warning"></i> 权限测试</el-breadcrumb-item>
            </el-breadcrumb>
        </div>
        <div class="container">
            <h1></h1>
            <p></p>
            <p>想尝试一下，请<router-link to="/login" class="logout">退出登录</router-link></p>
        </div>
		{{ menu }}
    </div>
</template>

<script>
export default {
    data: function(){
       return {
        	menuVO :{ 
	            	isUse:1
	        }
       }
    },
    methods:{
          getMenu() {
            let _this = this;
            this.$axios.post(
            	'/menu', 
            	JSON.stringify(this.menuVO)
            ).then(function (res) {
                //if (_this.validateCode(res)) {
                    _this.menu = res.data.data;
                    console.log(_this.menu);
                    //_this.$router.push('/');
                //} else {
                   // _this.error('post error1')
                //}
            }, function () {
                _this.systemError(_this)
            })
          }
    }
}
</script>

<style scoped>
h1{
    text-align: center;
    margin: 30px 0;
}
p{
    line-height: 30px;
    margin-bottom: 10px;
    text-indent: 2em;
}
.logout{
    color: #409EFF;
}
</style>