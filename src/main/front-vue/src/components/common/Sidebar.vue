<template>
    <div class="sidebar">
        <el-menu class="sidebar-el-menu" :default-active="onRoutes" :collapse="collapse" background-color="#324157"
            text-color="#bfcbd9" active-text-color="#20a0ff" unique-opened router>
            <template v-for="item in items">
                <template v-if="item.subs">
                    <el-submenu :index="item.index" :key="item.index">
                        <template slot="title">
                            <i :class="item.icon"></i><span slot="title">{{ item.title }}</span>
                        </template>
                        <el-menu-item v-for="(subItem,i) in item.subs" :key="i" :index="subItem.index">
                            {{ subItem.title }}
                        </el-menu-item>
                    </el-submenu>
                </template>
                <template v-else>
                    <el-menu-item :index="item.index" :key="item.index">
                        <i :class="item.icon"></i><span slot="title">{{ item.title }}</span>
                    </el-menu-item>
                </template>
            </template>
        </el-menu>
    </div>
</template>

<script>
    import bus from '../common/bus';
    export default {
        data() {
            return {
                collapse: false,
                items: [
                    {
                        icon: 'el-icon-setting',
                        index: 'dashboard',
                        title: '楹사퍨腰뽭〉'
                    },
                    {
                        icon: 'el-icon-tickets',
                        index: 'table',
                        title: '�읃簾�烏ⓩ졏'
                    },
                    {
                        icon: 'el-icon-message',
                        index: 'tabs',
                        title: 'tab�됮」�뜞'
                    },
                    {
                        icon: 'el-icon-date',
                        index: '3',
                        title: '烏ⓨ뜒�쎑�뀽',
                        subs: [
                            {
                                index: 'form',
                                title: '�읃�쑍烏ⓨ뜒'
                            },
                            {
                                index: 'editor',
                                title: '野뚧뻼�쑍煐뽬풌�솳'
                            },
                            {
                                index: 'markdown',
                                title: 'markdown煐뽬풌�솳'
                            },
                            {
                                index: 'upload',
                                title: '�뻼餓뜸툓鴉�'
                            }
                        ]
                    },
                    {
                        icon: 'el-icon-star-on',
                        index: 'charts',
                        title: 'schart�쎗烏�'
                    },
                    {
                        icon: 'el-icon-rank',
                        index: 'drag',
                        title: '�떀�떭�닓烏�'
                    },
                    {
                        icon: 'el-icon-warning',
                        index: 'permission',
                        title: '�쓢�솏役뗨캊'
                    },
                    {
                        icon: 'el-icon-error',
                        index: '404',
                        title: '404窈들씊'
                    }
                ]
            }
        },
        computed:{
            onRoutes(){
                return this.$route.path.replace('/','');
            }
        },
        created(){
        	this.getMenu();
        },
        methods: {
            getMenu() {
                let _this = this;
                _this.$axios.get('/menu').then(function (res) {
                        console.log(res);
                        console.log(res.data);
                        _this.items = res.data;
                        sessionStorage.setItem('bs_menu', JSON.stringify(_this.items))
                        console.log(_this.items);
                }, function (res) {
                    //console.log(res.data.message)
                })
            }
        }
    }
</script>

<style scoped>
    .sidebar{
        display: block;
        position: absolute;
        left: 0;
        top: 70px;
        bottom:0;
    }
    .sidebar-el-menu:not(.el-menu--collapse){
        width: 250px;
    }
    .sidebar > ul {
        height:100%;
    }
</style>
